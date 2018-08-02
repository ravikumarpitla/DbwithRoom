package com.example.ravikumar.myapplication.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "Accounts",

        foreignKeys = @ForeignKey(entity = Extensions.class,
                parentColumns = "context",
                childColumns = "context"))
public class Accounts {
    String status;
    String useID;
    String context;
    @PrimaryKey(autoGenerate = true)
    long id;
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUseID() {
        return useID;
    }

    public void setUseID(String useID) {
        this.useID = useID;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


}
