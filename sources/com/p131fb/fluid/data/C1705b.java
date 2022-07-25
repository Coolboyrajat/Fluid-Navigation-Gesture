package com.p131fb.fluid.data;

import p190io.objectbox.BoxStoreBuilder;
import p190io.objectbox.ModelBuilder;

/* renamed from: com.fb.fluid.data.b */
public class C1705b {
    /* renamed from: a */
    public static BoxStoreBuilder m7303a() {
        BoxStoreBuilder boxStoreBuilder = new BoxStoreBuilder(m7304b());
        boxStoreBuilder.entity(C1709d.f4952i);
        boxStoreBuilder.entity(C1712e.f4968i);
        return boxStoreBuilder;
    }

    /* renamed from: b */
    private static byte[] m7304b() {
        ModelBuilder modelBuilder = new ModelBuilder();
        modelBuilder.lastEntityId(3, 9209661517638647733L);
        modelBuilder.lastIndexId(1, 4583679178758826074L);
        modelBuilder.lastRelationId(1, 6335923222084936085L);
        ModelBuilder.EntityBuilder entity = modelBuilder.entity("TriggerButton");
        entity.mo9406id(2, 5422541327152352967L).lastPropertyId(10, 2961404703107074259L);
        entity.flags(1);
        entity.property("id", 6).mo9414id(1, 2319391537809887197L).flags(5);
        entity.property("layoutIndex", 5).mo9414id(2, 1420799079565913600L).flags(4);
        entity.property("waitForUp", 1).mo9414id(4, 3875080270023149472L).flags(4);
        entity.property("enabled", 1).mo9414id(10, 2961404703107074259L).flags(4);
        entity.property("actionType", 5).mo9414id(5, 6298873913216100416L).flags(4);
        entity.property("actionData", 9).mo9414id(6, 4395904680013121128L);
        entity.property("actionSecType", 5).mo9414id(7, 6011685244552253234L).flags(4);
        entity.property("actionSecData", 9).mo9414id(8, 7982839136384498356L);
        entity.property("triggerId", "Trigger", "trigger", 11).mo9414id(9, 3814485853527069960L).flags(1548).indexId(1, 4583679178758826074L);
        entity.entityDone();
        ModelBuilder.EntityBuilder entity2 = modelBuilder.entity("Trigger");
        entity2.mo9406id(3, 9209661517638647733L).lastPropertyId(16, 2736101500328701718L);
        entity2.flags(1);
        entity2.property("id", 6).mo9414id(1, 2726208319799256894L).flags(5);
        entity2.property("enabled", 1).mo9414id(2, 2260074695327182227L).flags(4);
        entity2.property("gravity", 5).mo9414id(3, 491903296534979908L).flags(4);
        entity2.property("location", 5).mo9414id(4, 3001938294312800142L).flags(4);
        entity2.property("sensitivity", 5).mo9414id(11, 5422513848323627799L).flags(4);
        entity2.property("size", 5).mo9414id(12, 2454374931178364572L).flags(4);
        entity2.property("transparency", 5).mo9414id(13, 8636066079534898774L).flags(4);
        entity2.property("instantPrimaryAction", 1).mo9414id(16, 2736101500328701718L).flags(4);
        entity2.property("instantSecondaryAction", 1).mo9414id(15, 4340474396633124721L).flags(4);
        entity2.property("actionTypeStart", 5).mo9414id(7, 4922707946011313656L).flags(4);
        entity2.property("actionDataStart", 9).mo9414id(8, 5577354721520801627L);
        entity2.property("actionTypeEnd", 5).mo9414id(9, 1944466399138064949L).flags(4);
        entity2.property("actionDataEnd", 9).mo9414id(10, 7573047043622943276L);
        entity2.entityDone();
        return modelBuilder.build();
    }
}
