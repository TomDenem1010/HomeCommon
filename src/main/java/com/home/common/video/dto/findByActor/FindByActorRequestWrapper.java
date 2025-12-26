package com.home.common.video.dto.findByActor;

import com.home.common.dto.HomeRequest;

public class FindByActorRequestWrapper extends HomeRequest<FindByActorRequest> {

  @Override
  public String toString() {
    return "FindByActorRequestWrapper{"
        + "header="
        + getHeader()
        + ", request="
        + getRequest()
        + '}';
  }
}
