//package com.epam.tc.hw4.entities;
//
//import com.epam.tc.hw4.utils.AttachmentUtils;
//import java.io.InputStream;
//import java.net.URL;
//import java.util.List;
//import lombok.SneakyThrows;
//import org.assertj.core.api.Assertions;
//import org.testng.annotations.Test;
//
//public class Attachment {
//
//    public static final String CAT_URL =
//        "https://upload.wikimedia.org/wikipedia/commons/b/b6/Felis_catus-cat_on_snow.jpg";
//
//    @Test
//    public void testForAttachmentsDemo() {
//        attachCatPictures();
//
//        List<String> manualInput = List.of("a", "Facka", "Shitty-pitty");
//        AttachmentUtils.makeStringAttachment(manualInput);
//
//        Assertions.assertThat(true).isTrue();
//    }
//
//    @SneakyThrows
//    private void attachCatPictures() {
//        try (InputStream is = new URL(CAT_URL).openStream()) {
//            AttachmentUtils.attachFromInputStrim("Everyone loves cats", is);
//        }
//    }
//}
