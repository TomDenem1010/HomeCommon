package com.home.common.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HomeResponse<T extends HomeObject> {

    private HomeHeader header;
    private T response;

    @Override
    public String toString() {
        return "HomeResponse{" +
                "header=" + header +
                ", response=" + response +
                '}';
    }
}
