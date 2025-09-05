package com.home.common.video.dto.findFolders;

import com.home.common.dto.HomeObject;
import com.home.common.video.dto.FolderDto;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FindFoldersResponse extends HomeObject {

    private List<FolderDto> folders;
}
