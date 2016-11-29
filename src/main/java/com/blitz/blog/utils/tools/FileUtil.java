package com.blitz.blog.utils.tools;

import java.io.*;
import java.util.Properties;

/**
 * @Description:文件操作工具类
 * @create Author:jianglong
 * @create Date:2015-7-7
 * @version V1.0
 */
public class FileUtil {

	private static final int BUFFER_SIZE = 16 * 1024;

	/**
	 * 根据文件名获得文件的扩展名
	 * 
	 * @param fileName
	 * @return
	 */
	public static String getExtention(String fileName) {
		int pos = -1;
		try {
			pos = fileName.lastIndexOf(".");
			String ext = fileName.substring(pos);
			if (ext == null || "".equals(ext)) {
				return "";
			}
			return ext;
		} catch (RuntimeException e) {
			e.printStackTrace();
			return "";
		}
	}

	/**
	 * 根据图片名拿到扩展名
	 * 
	 * @param fileName
	 * @return
	 */
	public static String getImageExtention(String fileName) {
		int pos = -1;
		try {
			pos = fileName.lastIndexOf(".");

			String ext = fileName.substring(pos);
			if (".jpg".equalsIgnoreCase(ext) || ".gif".equalsIgnoreCase(ext)
					|| ".bmp".equalsIgnoreCase(ext)
					|| ".png".equalsIgnoreCase(ext)
					|| ".JPEG".equalsIgnoreCase(ext)
					|| ".WMF".equalsIgnoreCase(ext)
					|| ".EMF".equalsIgnoreCase(ext)
					|| ".TIFF".equalsIgnoreCase(ext)
					|| ".PSD".equalsIgnoreCase(ext)
					|| ".SVG".equalsIgnoreCase(ext)
					|| ".JPEG2000".equalsIgnoreCase(ext)) {
				return ext;
			} else {
				return null;
			}
		} catch (RuntimeException e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 保存文件(拷贝文件)
	 * 
	 * @param src-源文件
	 * @param dst-目标文件
	 * @throws FileNotFoundException
	 */
	public static void saveFile(File src, File dst) {
		InputStream in = null;
		OutputStream out = null;
		try {
			in = new BufferedInputStream(new FileInputStream(src), BUFFER_SIZE);
			out = new BufferedOutputStream(new FileOutputStream(dst, true),
					BUFFER_SIZE);
			byte[] buffer = new byte[BUFFER_SIZE];
			while (in.read(buffer) > 0) {
				out.write(buffer);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * @method:readPropertiesFile
	 * @Description: 根据传入属性获取系统参数文件中的属性值
	 * @create Author:jianglong
	 * @create Date:2015-7-7
	 * @exception
	 * @Modification:
	 * @param property 变量属性
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static String readPropertiesFile(String fileName, String property)
			throws FileNotFoundException, IOException {
		String context=FileUtil.class.getResource("/").getPath().replace("%20", " ");
		File file = new File(context+fileName);
		InputStream in = new BufferedInputStream(new FileInputStream(file));
		Properties p = new Properties();
		p.load(in);
		return p.getProperty(property);
	}                          
	public static String getProperties(String fileName,String property){
		String context=FileUtil.class.getResource("/").getPath().replace("%20", " ");
		File file = new File(context+fileName);
		Properties p = new Properties();
		try{
			InputStream in = new BufferedInputStream(new FileInputStream(file));
			p.load(in);
		}catch(Exception e){
			
		}
		return p.getProperty(property);
	}

}
