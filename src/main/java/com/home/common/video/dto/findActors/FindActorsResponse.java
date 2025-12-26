package com.home.common.video.dto.findActors;

import com.home.common.dto.HomeObject;
import com.home.common.video.dto.ActorDto;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FindActorsResponse extends HomeObject {

  private List<ActorDto> actors;

  @Override
  public String toString() {
    return "FindActorsResponse{" + "actors=" + actors + '}';
  }
}
