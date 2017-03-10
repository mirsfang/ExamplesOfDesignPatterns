package create.builder;

/**
 * 测试类，生产一个金刚狼
 * @author Chayne_Shen 2017/3/10 0010.
 */
public class BuilderTest {
    public static void main(String[] args) {
        WolverineDirector director = new WolverineDirector();
        XMan wolverine = director.constructWolverine(new WolverineBuilder());
    }
}
