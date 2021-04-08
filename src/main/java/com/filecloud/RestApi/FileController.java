package com.filecloud.RestApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FileController {
    @Autowired
    FileRepo repo;

    @PostMapping(path = "file", consumes = {"application/json"})
    public FileCloudFile PutFile(@RequestBody FileCloudFile file)
    {
        repo.save(file);
        return file;
    }

    @PutMapping(path = "file", consumes = {"application/json"})
    public FileCloudFile UpdateFile(@RequestBody FileCloudFile file)
    {
        repo.save(file);
        return file;
    }

    @GetMapping(path = "/files", produces = {"application/json"})
    public List<FileCloudFile> GetFiles()
    {
        return repo.findAll();
    }

    @GetMapping(path = "/file/{fid}", produces = {"application/json"})
    public Optional<FileCloudFile> GetFile(@PathVariable("fid") int fid)
    {
        return repo.findById(fid);
    }

    @DeleteMapping(path = "/file/{fid}")
    public String DeleteFile(@PathVariable int fid)
    {
        FileCloudFile file = repo.getOne(fid);
        repo.delete(file);
        return "File Deleted";
    }
}
