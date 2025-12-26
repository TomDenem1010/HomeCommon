package com.home.common.exception;

public abstract class HomeException extends RuntimeException {

  public HomeException(String message) {
    super(message);
  }

  public HomeException(String message, Throwable cause) {
    super(message, cause);
  }
}
