package com.filecloud.RestApi;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepo extends JpaRepository<FileCloudFile, Integer>
{

}
