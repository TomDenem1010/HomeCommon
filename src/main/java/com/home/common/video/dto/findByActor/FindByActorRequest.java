package com.home.common.video.dto.findByActor;

import com.home.common.dto.HomeObject;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FindByActorRequest extends HomeObject {

    private String name;
}
