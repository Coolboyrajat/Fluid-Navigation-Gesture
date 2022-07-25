package com.joaomgcd.taskerpluginlibrary.condition;

import kotlin.Unit;

public abstract class TaskerPluginRunnerConditionState<TInput, TOutput> extends TaskerPluginRunnerCondition<TInput, TOutput, Unit> {
    private final boolean isEvent;

    /* access modifiers changed from: protected */
    public boolean isEvent() {
        return this.isEvent;
    }
}
