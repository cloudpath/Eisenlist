package com.josuemartinez.todolistapp;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.josuemartinez.todolistapp.database.AppDatabase;
import com.josuemartinez.todolistapp.database.TaskEntry;

public class AddTasksViewModel extends ViewModel {

    public LiveData<TaskEntry> getTask;
    private LiveData<TaskEntry> task;

    public AddTasksViewModel(AppDatabase database, int taskId) {
        task = database.taskDao().loadTaskById(taskId);
    }

    public LiveData<TaskEntry> getTask(){ return task;}

}
