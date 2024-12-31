rootProject.layout.buildDirectory = file("../build")
subprojects {
    project.layout.buildDirectory = file(rootProject.layout.buildDirectory.map { "$it/${project.name}" })
}
subprojects {
    project.evaluationDependsOn(":app")
}

tasks.register<Delete>("clean") {
    delete(rootProject.layout.buildDirectory)
}
