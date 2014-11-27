package stan.block.api;

import stan.UserMoreInfo;

public class BlockMain
{
//Поля
    //создание пути к директории лога
    static public String CreateLogDirName(UserMoreInfo umi, String logDirPath)
    {
        String path = logDirPath + umi.GetMail();
        return path;
    }
}