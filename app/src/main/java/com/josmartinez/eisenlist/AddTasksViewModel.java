package com.josmartinez.eisenlist;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.josmartinez.eisenlist.database.AppDatabase;
import com.josmartinez.eisenlist.database.TaskEntry;

public class AddTasksViewModel extends ViewModel {

    private final LiveData<TaskEntry> task;
    public LiveData<TaskEntry> getTask(){ return task;}

    public AddTasksViewModel(AppDatabase database, int taskId) {
        task = database.taskDao().loadTaskById(taskId);
    }


}
