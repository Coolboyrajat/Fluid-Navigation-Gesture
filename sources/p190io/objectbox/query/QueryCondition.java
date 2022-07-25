package p190io.objectbox.query;

import java.util.Date;
import p190io.objectbox.Property;
import p190io.objectbox.annotation.apihint.Experimental;
import p190io.objectbox.annotation.apihint.Internal;
import p190io.objectbox.exception.DbException;
import p190io.objectbox.query.QueryBuilder;

@Experimental
@Internal
/* renamed from: io.objectbox.query.QueryCondition */
public interface QueryCondition {

    /* renamed from: io.objectbox.query.QueryCondition$AbstractCondition */
    public static abstract class AbstractCondition implements QueryCondition {
        public final Object value;
        protected final Object[] values;

        AbstractCondition(Object obj) {
            this.value = obj;
            this.values = null;
        }

        AbstractCondition(Object[] objArr) {
            this.value = null;
            this.values = objArr;
        }
    }

    /* renamed from: io.objectbox.query.QueryCondition$PropertyCondition */
    public static class PropertyCondition extends AbstractCondition {
        private final Operation operation;
        public final Property property;

        /* renamed from: io.objectbox.query.QueryCondition$PropertyCondition$Operation */
        public enum Operation {
            EQUALS,
            NOT_EQUALS,
            BETWEEN,
            IN,
            GREATER_THAN,
            LESS_THAN,
            IS_NULL,
            IS_NOT_NULL,
            CONTAINS,
            STARTS_WITH,
            ENDS_WITH
        }

        public PropertyCondition(Property property2, Operation operation2, Object obj) {
            super(checkValueForType(property2, obj));
            this.property = property2;
            this.operation = operation2;
        }

        public PropertyCondition(Property property2, Operation operation2, Object[] objArr) {
            super(checkValuesForType(property2, operation2, objArr));
            this.property = property2;
            this.operation = operation2;
        }

        private static Object checkValueForType(Property property2, Object obj) {
            if (obj == null || !obj.getClass().isArray()) {
                Class<?> cls = property2.type;
                if (cls != Date.class) {
                    if (cls == Boolean.TYPE || cls == Boolean.class) {
                        if (obj instanceof Boolean) {
                            return Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
                        }
                        if (obj instanceof Number) {
                            int intValue = ((Number) obj).intValue();
                            if (!(intValue == 0 || intValue == 1)) {
                                throw new DbException("Illegal boolean value: numbers must be 0 or 1, but was " + obj);
                            }
                        } else if (obj instanceof String) {
                            String str = (String) obj;
                            if ("TRUE".equalsIgnoreCase(str)) {
                                return 1;
                            }
                            if ("FALSE".equalsIgnoreCase(str)) {
                                return 0;
                            }
                            throw new DbException("Illegal boolean value: Strings must be \"TRUE\" or \"FALSE\" (case insensitive), but was " + obj);
                        }
                    }
                    return obj;
                } else if (obj instanceof Date) {
                    return Long.valueOf(((Date) obj).getTime());
                } else {
                    if (obj instanceof Long) {
                        return obj;
                    }
                    throw new DbException("Illegal date value: expected java.util.Date or Long for value " + obj);
                }
            } else {
                throw new DbException("Illegal value: found array, but simple object required");
            }
        }

        private static Object[] checkValuesForType(Property property2, Operation operation2, Object[] objArr) {
            if (objArr != null) {
                for (int i = 0; i < objArr.length; i++) {
                    objArr[i] = checkValueForType(property2, objArr[i]);
                }
                return objArr;
            } else if (operation2 == Operation.IS_NULL || operation2 == Operation.IS_NOT_NULL) {
                return null;
            } else {
                throw new IllegalArgumentException("This operation requires non-null values.");
            }
        }

        public void applyTo(QueryBuilder queryBuilder, QueryBuilder.StringOrder stringOrder) {
            Property property2;
            double floatValue;
            Property property3;
            long intValue;
            Property property4;
            double floatValue2;
            Property property5;
            long intValue2;
            Property property6;
            double floatValue3;
            double floatValue4;
            Property property7;
            long intValue3;
            long intValue4;
            Property property8;
            long intValue5;
            Property property9;
            long intValue6;
            Operation operation2 = this.operation;
            if (operation2 == Operation.EQUALS) {
                Object obj = this.value;
                if (obj instanceof Long) {
                    property9 = this.property;
                    intValue6 = ((Long) obj).longValue();
                } else if (obj instanceof Integer) {
                    property9 = this.property;
                    intValue6 = (long) ((Integer) obj).intValue();
                } else if (obj instanceof String) {
                    queryBuilder.equal(this.property, (String) obj, stringOrder);
                    return;
                } else {
                    return;
                }
                queryBuilder.equal(property9, intValue6);
            } else if (operation2 == Operation.NOT_EQUALS) {
                Object obj2 = this.value;
                if (obj2 instanceof Long) {
                    property8 = this.property;
                    intValue5 = ((Long) obj2).longValue();
                } else if (obj2 instanceof Integer) {
                    property8 = this.property;
                    intValue5 = (long) ((Integer) obj2).intValue();
                } else if (obj2 instanceof String) {
                    queryBuilder.notEqual(this.property, (String) obj2, stringOrder);
                    return;
                } else {
                    return;
                }
                queryBuilder.notEqual(property8, intValue5);
            } else {
                int i = 0;
                if (operation2 == Operation.BETWEEN) {
                    Object[] objArr = this.values;
                    if (!(objArr[0] instanceof Long) || !(objArr[1] instanceof Long)) {
                        Object[] objArr2 = this.values;
                        if (!(objArr2[0] instanceof Integer) || !(objArr2[1] instanceof Integer)) {
                            Object[] objArr3 = this.values;
                            if (!(objArr3[0] instanceof Double) || !(objArr3[1] instanceof Double)) {
                                Object[] objArr4 = this.values;
                                if ((objArr4[0] instanceof Float) && (objArr4[1] instanceof Float)) {
                                    property6 = this.property;
                                    floatValue3 = (double) ((Float) objArr4[0]).floatValue();
                                    floatValue4 = (double) ((Float) this.values[1]).floatValue();
                                } else {
                                    return;
                                }
                            } else {
                                property6 = this.property;
                                floatValue3 = ((Double) objArr3[0]).doubleValue();
                                floatValue4 = ((Double) this.values[1]).doubleValue();
                            }
                            queryBuilder.between(property6, floatValue3, floatValue4);
                            return;
                        }
                        property7 = this.property;
                        intValue3 = (long) ((Integer) objArr2[0]).intValue();
                        intValue4 = (long) ((Integer) this.values[1]).intValue();
                    } else {
                        property7 = this.property;
                        intValue3 = ((Long) objArr[0]).longValue();
                        intValue4 = ((Long) this.values[1]).longValue();
                    }
                    queryBuilder.between(property7, intValue3, intValue4);
                } else if (operation2 == Operation.IN) {
                    Object[] objArr5 = this.values;
                    if (objArr5[0] instanceof Long) {
                        long[] jArr = new long[objArr5.length];
                        while (true) {
                            Object[] objArr6 = this.values;
                            if (i < objArr6.length) {
                                jArr[i] = ((Long) objArr6[i]).longValue();
                                i++;
                            } else {
                                queryBuilder.mo9773in(this.property, jArr);
                                return;
                            }
                        }
                    } else if (objArr5[0] instanceof Integer) {
                        int[] iArr = new int[objArr5.length];
                        while (true) {
                            Object[] objArr7 = this.values;
                            if (i < objArr7.length) {
                                iArr[i] = ((Integer) objArr7[i]).intValue();
                                i++;
                            } else {
                                queryBuilder.mo9772in(this.property, iArr);
                                return;
                            }
                        }
                    }
                } else if (operation2 == Operation.GREATER_THAN) {
                    Object obj3 = this.value;
                    if (obj3 instanceof Long) {
                        property5 = this.property;
                        intValue2 = ((Long) obj3).longValue();
                    } else if (obj3 instanceof Integer) {
                        property5 = this.property;
                        intValue2 = (long) ((Integer) obj3).intValue();
                    } else {
                        if (obj3 instanceof Double) {
                            property4 = this.property;
                            floatValue2 = ((Double) obj3).doubleValue();
                        } else if (obj3 instanceof Float) {
                            property4 = this.property;
                            floatValue2 = (double) ((Float) obj3).floatValue();
                        } else {
                            return;
                        }
                        queryBuilder.greater(property4, floatValue2);
                        return;
                    }
                    queryBuilder.greater(property5, intValue2);
                } else if (operation2 == Operation.LESS_THAN) {
                    Object obj4 = this.value;
                    if (obj4 instanceof Long) {
                        property3 = this.property;
                        intValue = ((Long) obj4).longValue();
                    } else if (obj4 instanceof Integer) {
                        property3 = this.property;
                        intValue = (long) ((Integer) obj4).intValue();
                    } else {
                        if (obj4 instanceof Double) {
                            property2 = this.property;
                            floatValue = ((Double) obj4).doubleValue();
                        } else if (obj4 instanceof Float) {
                            property2 = this.property;
                            floatValue = (double) ((Float) obj4).floatValue();
                        } else {
                            return;
                        }
                        queryBuilder.less(property2, floatValue);
                        return;
                    }
                    queryBuilder.less(property3, intValue);
                } else if (operation2 == Operation.IS_NULL) {
                    queryBuilder.isNull(this.property);
                } else if (operation2 == Operation.IS_NOT_NULL) {
                    queryBuilder.notNull(this.property);
                } else if (operation2 == Operation.CONTAINS) {
                    queryBuilder.contains(this.property, (String) this.value, stringOrder);
                } else if (operation2 == Operation.STARTS_WITH) {
                    queryBuilder.startsWith(this.property, (String) this.value, stringOrder);
                } else if (operation2 == Operation.ENDS_WITH) {
                    queryBuilder.endsWith(this.property, (String) this.value, stringOrder);
                } else {
                    throw new UnsupportedOperationException("This operation is not known.");
                }
            }
        }

        public void setParameterFor(Query query, Object obj) {
            Property property2;
            double floatValue;
            Property property3;
            long intValue;
            if (obj != null) {
                Operation operation2 = this.operation;
                if (operation2 == Operation.BETWEEN) {
                    throw new UnsupportedOperationException("The BETWEEN condition requires two parameters.");
                } else if (operation2 != Operation.IN) {
                    if (obj instanceof Long) {
                        property3 = this.property;
                        intValue = ((Long) obj).longValue();
                    } else if (obj instanceof Integer) {
                        property3 = this.property;
                        intValue = (long) ((Integer) obj).intValue();
                    } else if (obj instanceof String) {
                        query.setParameter(this.property, (String) obj);
                        return;
                    } else {
                        if (obj instanceof Double) {
                            property2 = this.property;
                            floatValue = ((Double) obj).doubleValue();
                        } else if (obj instanceof Float) {
                            property2 = this.property;
                            floatValue = (double) ((Float) obj).floatValue();
                        } else {
                            throw new IllegalArgumentException("Only LONG, INTEGER, DOUBLE, FLOAT or STRING parameters are supported.");
                        }
                        query.setParameter(property2, floatValue);
                        return;
                    }
                    query.setParameter(property3, intValue);
                } else {
                    throw new UnsupportedOperationException("The IN condition does not support changing parameters.");
                }
            } else {
                throw new IllegalArgumentException("The new parameter can not be null.");
            }
        }

        public void setParameterFor(Query query, Object obj, Object obj2) {
            Property property2;
            double floatValue;
            double floatValue2;
            Property property3;
            long intValue;
            long intValue2;
            if (obj == null || obj2 == null) {
                throw new IllegalArgumentException("The new parameters can not be null.");
            } else if (this.operation == Operation.BETWEEN) {
                if ((obj instanceof Long) && (obj2 instanceof Long)) {
                    property3 = this.property;
                    intValue = ((Long) obj).longValue();
                    intValue2 = ((Long) obj2).longValue();
                } else if (!(obj instanceof Integer) || !(obj2 instanceof Integer)) {
                    if ((obj instanceof Double) && (obj2 instanceof Double)) {
                        property2 = this.property;
                        floatValue = ((Double) obj).doubleValue();
                        floatValue2 = ((Double) obj2).doubleValue();
                    } else if (!(obj instanceof Float) || !(obj2 instanceof Float)) {
                        throw new IllegalArgumentException("The BETWEEN condition only supports LONG, INTEGER, DOUBLE or FLOAT parameters.");
                    } else {
                        property2 = this.property;
                        floatValue = (double) ((Float) obj).floatValue();
                        floatValue2 = (double) ((Float) obj2).floatValue();
                    }
                    query.setParameters(property2, floatValue, floatValue2);
                    return;
                } else {
                    property3 = this.property;
                    intValue = (long) ((Integer) obj).intValue();
                    intValue2 = (long) ((Integer) obj2).intValue();
                }
                query.setParameters(property3, intValue, intValue2);
            } else {
                throw new UnsupportedOperationException("Only the BETWEEN condition supports two parameters.");
            }
        }
    }

    void applyTo(QueryBuilder queryBuilder, QueryBuilder.StringOrder stringOrder);

    void setParameterFor(Query query, Object obj);

    void setParameterFor(Query query, Object obj, Object obj2);
}
