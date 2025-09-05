package com.home.common.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class HomeRequest<T extends HomeObject> {

    private HomeHeader header;
    private T request;
}
