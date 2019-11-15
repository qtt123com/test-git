/**
 * @Author:qutt
 * @Date:2019/11/7
 * @project: test
 * @package:PACKAGE_NAME
 * @description: insert description of this class
 */
public class TestMain {
    public static void main(String[] args) {
        String str = "-1";
        String s = str.replace("-1/", "");
        System.out.println(s);

        String str2 = "-1/-1/-1";
        String s3 = str2.replace("-1/", "");
        System.out.println(s3);
    }
}
