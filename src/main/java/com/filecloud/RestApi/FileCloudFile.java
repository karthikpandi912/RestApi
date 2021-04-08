package com.filecloud.RestApi;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FileCloudFile {
    @Id
    private int fileid;
    private String filename;
    private String filepath;

    public int getFileid() {
        return fileid;
    }

    public void setFileid(int fileid) {
        this.fileid = fileid;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    @Override
    public String toString() {
        return "FileCloudFile{" +
                "fileid=" + fileid +
                ", filename='" + filename + '\'' +
                ", filepath='" + filepath + '\'' +
                '}';
    }
}
