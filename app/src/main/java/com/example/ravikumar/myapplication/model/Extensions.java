package com.example.ravikumar.myapplication.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "Extensions",
        foreignKeys = @ForeignKey(entity = Contacts.class,
        parentColumns = "id",
        childColumns = "phoneContactId"))
public class Extensions {
    String context;
    long phoneContactId;
    @PrimaryKey(autoGenerate = true)
    long id;

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public long getPhoneContactId() {
        return phoneContactId;
    }

    public void setPhoneContactId(long phoneContactId) {
        this.phoneContactId = phoneContactId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
