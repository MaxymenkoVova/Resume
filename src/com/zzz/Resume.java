package com.zzz;

public class Resume implements Comparable<Resume>{
    private String uuid;
    //see you later!
    //private String fullName;

    public Resume(String uuid) {
        this.uuid = uuid;
    }

    public String getUuid() {
        return uuid;
    }

    @Override
    public String toString() {
        return uuid;
    }

    @Override
    public int compareTo(Resume o) {
        return this.uuid.compareTo(o.getUuid());
    }
}
