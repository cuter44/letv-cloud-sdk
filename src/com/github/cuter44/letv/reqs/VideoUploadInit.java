package com.github.cuter44.letv.reqs;

import java.util.List;
import java.util.Properties;
import java.util.Arrays;
//import java.io.IOException;

//import com.alibaba.fastjson.*;

//import com.github.cuter44.letv.LetvException;

public class VideoUploadInit extends RequestBase
{
    public static final String KEY_CLIENT_IP = "client_id";
    public static final String KEY_FILE_SIZE = "file_size";

    public static final List<String> KEYS_PARAM_NAME = Arrays.asList(
        "api",
        "client_ip",
        "file_size",
        "format",
        "timestamp",
        "user_unique",
        "ver",
        "video_name"
    );

    public VideoUploadInit(Properties prop)
    {
        super(prop);

        this.setProperty(KEY_API, "video.upload.init");

        return;
    }

  // BUILD
    /**
     * build() invoke this method
     */
    public VideoUploadInit setClientIp(String clientIp)
    {
        this.setProperty(KEY_CLIENT_IP, clientIp);

        return(this);
    }

    public VideoUploadInit setFileSize(int fileSize)
    {
        this.setProperty(KEY_FILE_SIZE, String.valueOf(fileSize));

        return(this);
    }

    @Override
    public VideoUploadInit build()
    {
        super.build();

        return(this);
    }

  // SIGN
    @Override
    public VideoUploadInit sign()
    {
        this.setProperty(
            KEY_SIGN,
            super.sign(KEYS_PARAM_NAME)
        );

        return(this);
    }

  // TO_URL
    @Override
    public String toURL()
    {
        return(
            super.toSignedURL(KEYS_PARAM_NAME)
        );
    }

  // EXECUTE
    // use super.execute()
}
