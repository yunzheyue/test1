import org.gradle.api.Plugin
import org.gradle.api.Project

class test1plugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
     System.out.println("\n"
             + "========================="
             + "\n"
             + "==" + project.getName() + "独立插件"
             + "\n"
             + "========================="
             + "\n");
    }
}


