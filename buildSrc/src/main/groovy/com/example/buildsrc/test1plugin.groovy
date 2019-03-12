import org.gradle.api.Plugin
import org.gradle.api.Project


class test1plugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        println('这是独立的插件')
    }
}

