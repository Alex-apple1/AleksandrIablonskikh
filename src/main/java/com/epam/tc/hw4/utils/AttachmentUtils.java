package com.epam.tc.hw4.utils;

import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import java.io.InputStream;
import java.util.List;
import lombok.experimental.UtilityClass;

@UtilityClass
public class AttachmentUtils {

    public void attachFromInputStrim(final String name, InputStream inputStream) {
        Allure.addAttachment(name, inputStream);
    }

    @Attachment
    public String makeStringAttachment(List<String> attachmentStrings) {
        return attachmentStrings.toString();
    }
}
