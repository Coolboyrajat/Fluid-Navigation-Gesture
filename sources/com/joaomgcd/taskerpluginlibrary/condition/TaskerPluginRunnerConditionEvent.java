package com.joaomgcd.taskerpluginlibrary.condition;

public abstract class TaskerPluginRunnerConditionEvent<TInput, TOutput, TUpdate> extends TaskerPluginRunnerCondition<TInput, TOutput, TUpdate> {
    private final boolean isEvent = true;

    /* access modifiers changed from: protected */
    public boolean isEvent() {
        return this.isEvent;
    }
}
