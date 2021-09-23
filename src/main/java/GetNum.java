import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetNum {
    public static void main(String[] args) throws IOException {
        ReadFileContent readFileContent=new ReadFileContent();
        String fileName="Testfile.java";
        String path="C:\\Users\\34327\\IdeaProjects\\javaTest\\src\\main\\java\\";
        //System.out.println(ReadFileContent.readFileContent("C:\\Users\\34327\\IdeaProjects\\javaTest\\src\\main\\java\\TestFile.java"));
        String lines=ReadFileContent.readFileContent(path+fileName);
        List<String> stat=new ArrayList<String>();
        stat.add("if (");
        stat.add("switch (");
        stat.add("case ");
        stat.add("} else ");
        stat.add("} else if (");
        int ifNum=-1;
        int switchNum=-1;
        int caseNum=-1;
        int elseNum=-1;
        int elseifNum=-1;
        int start;
        for (String s :stat){
            start=0;
            while (start!=-1){
                start=lines.indexOf(s,start+1);
                if (s.equals("if (")){
                    ifNum++;
                } else if (s.equals("switch (")){
                    switchNum++;
                } else if(s.equals("case ")){
                    caseNum++;
                } else if(s.equals("} else ")){
                    elseNum++;
                } else if(s.equals("} else if (")){
                    elseifNum++;
                }
            }
        }
        System.out.println(ifNum-elseifNum);
        System.out.println(switchNum);
        System.out.println(caseNum);
        System.out.println(elseNum-elseifNum);
    }
}
