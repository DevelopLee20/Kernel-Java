class UnsupportedFunctionException extends RuntimeException {
    final private int ERR_CODE; // 에러 코드

    public UnsupportedFunctionException(String message) {
        super(message);
        ERR_CODE = 100;
    }

    public UnsupportedFunctionException(String message, int errorCode) {
        super(message);
        ERR_CODE = errorCode;
    }

    public int getErrorCode() {
        return this.ERR_CODE;
    }

    public String getMessage() {
        return "[" + getErrorCode() + "]" + super.getMessage();
    }
}

public class Exercise8_9 {
    public static void main(String[] args) {
        throw new UnsupportedFunctionException("지원하지 않는 기능입니다.", 100);
    }
}
