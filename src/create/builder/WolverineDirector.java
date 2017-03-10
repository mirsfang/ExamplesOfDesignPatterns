package create.builder;

/**
 * 控制builder生产金刚狼
 * @author Chayne_Shen 2017/3/10 0010.
 */

public class WolverineDirector {
    public XMan constructWolverine(WolverineBuilder wolverineBuilder) {
        return wolverineBuilder
                .buildXFactor()
                .buildLover()
                .buildXman();
    }
}
