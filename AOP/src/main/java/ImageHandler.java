
import cn.hutool.core.util.ImageUtil;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.LoggerFactory;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.SocketPermission;
import java.util.logging.Logger;

/**
 * Created by MAIBENBEN on 2019/3/11.
**/

@Aspect
public class ImageHandler {
    public static final org.slf4j.Logger logger = LoggerFactory.getLogger(ImageHandler.class);
    //切点函数，必须为空
    @Pointcut("execution(* ImageCopy.copyImage())")
    public void handleImage(){
    }
    @Before(value = "handleImage()")
    public void pressTextOnImage(){
        logger.info("开始给图片加水印..");
        File srcFile = new File("D:/bg1.jpg");

        //通过字节输入流创建一个BufferedImage对象
       // InputStream input = new FileInputStream(srcFile);
       // BufferedImage srcImg = ImageIO.read(input);
        //int width = srcImg.getWidth();
       // int height = srcImg.getHeight();
       // System.out.println("原图宽："+width+",原图高："+height);
        File destFile = new File("D:/bg1.jpg");
        Color color = new Color(214, 43, 62);
        Font font = new Font("微软雅黑",Font.BOLD,60);
        ImageUtil.pressText(srcFile,destFile,"Spring AOP水印",color,font,700,450,1.0f);
    }

    @AfterReturning("handleImage()")
    public void greyImage(){
        logger.info("开始将图片转成黑白...");
        File srcFile = new File("E:/bg1.jpg");
        File destFile = new File("E:/bg1.jpg");
        ImageUtil.gray(srcFile,destFile);
}
}
