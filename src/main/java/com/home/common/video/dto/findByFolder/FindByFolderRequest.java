package com.home.common.video.dto.findByFolder;

import com.home.common.dto.HomeObject;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FindByFolderRequest extends HomeObject {

    private String folder;

    @Override
    public String toString() {
        return "FindByFolderRequest{" +
                "folder='" + folder + '\'' +
                '}';
    }
}
