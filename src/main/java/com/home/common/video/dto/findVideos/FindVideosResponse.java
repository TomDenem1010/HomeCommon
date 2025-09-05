package com.home.common.video.dto.findVideos;

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
public class FindVideosResponse extends HomeObject {

    private List<VideoDto> videos;
}
