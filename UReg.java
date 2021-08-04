package org.example;

 class URegException extends Exception {
    static String message;
    enum ExceptionType{
        ENTERED_NULL, ENTERED_INVALID

    }
    ExceptionType type;
    public URegException(ExceptionType type,String message){
    super(message);
    this.type=type;
    }
}
