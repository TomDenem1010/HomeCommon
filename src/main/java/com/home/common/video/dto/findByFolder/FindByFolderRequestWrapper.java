package com.home.common.video.dto.findByFolder;

import com.home.common.dto.HomeRequest;

public class FindByFolderRequestWrapper extends HomeRequest<FindByFolderRequest> {

  @Override
  public String toString() {
    return "FindByFolderRequestWrapper{"
        + "header="
        + getHeader()
        + ", request="
        + getRequest()
        + '}';
  }
}
