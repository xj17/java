1.流根据方向可以分为输入流（InputStream）(read)和输出流(OuputStream)(write)[输入流和输出流是相对于内存而言的]
2.流根据读取数据的方式分为字节流和字符流，字节流按照字节的方式读取，字符流是按照字符的方式读取，一次读取2个字节，java中一个字符占两个字节。
3.字节流适合读取视频，音乐，图片等二进制文件。字符流适合读取纯文本文件。
4.字节流都以Stream结尾，所有的字符流都含有Reader和Writer。

//temp.txt文件中的内容是abcdef

 例子的阅读顺序 FileInputStream--FileOutputStream --FileReader --FileWriter --BufferedReader --BufferedWriter --Decorator装饰者模式 --DataInputStream和DataOutputStream --PrintSteam和PrintWriter  --ObjectOutputStream(对象的序列化)和ObjectInputSteam（对象的反序列化）
