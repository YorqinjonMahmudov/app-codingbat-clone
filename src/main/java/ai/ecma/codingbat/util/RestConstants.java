package ai.ecma.codingbat.util;

import ai.ecma.codingbat.controller.cotract.AuthController;

public interface RestConstants {
    String DEFAULT_PAGE_NUMBER = "0";
    String DEFAULT_PAGE_SIZE = "10";

    String AUTHENTICATION_HEADER = "Authorization";

    String[] OPEN_PAGES = {
            AuthController.AUTH_CONTROLLER_BASE_PATH + "/**"
    };
}
