package com.ecjtu.qrcode;

import jp.sourceforge.qrcode.QRCodeDecoder;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * 使用QRCode的方式解析二维码
 *
 */
public class TestReadQRCode {
    public static void main(String[] args) {
        // 获取二维码
        File file = new File("E://logo_QRCode.png");
        try {
            // 读取二维码
            BufferedImage bufferedImage = ImageIO.read(file);
            QRCodeDecoder decoder = new QRCodeDecoder();
            // BUG 显示不出正确的内容..TODO
            String s = new String(decoder.decode(new MyQRCodeImage(bufferedImage)));
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
