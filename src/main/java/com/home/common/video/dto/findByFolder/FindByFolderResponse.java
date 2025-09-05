package com.home.common.video.dto.findByFolder;

import com.home.common.dto.HomeObject;
import com.home.common.video.dto.VideoDto;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FindByFolderResponse extends HomeObject {

    private List<VideoDto> videos;
}
