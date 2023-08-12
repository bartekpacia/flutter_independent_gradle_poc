# flutter_independent_gradle_poc

Proof of concept of using Gradle as a task runner for the whole Flutter app –
not just for Android subproject of it.

See PR #1 for a full-diff of changes required to make it work.

### Benefits of using Gradle as a task runner

- Mature, very powerful build automation tool
  - Miles ahead of Melos, let alone `make`
  - Ecosystem of plugins, so it'll be easier to share common tasks
- Truly cross-platform
- Tasks are written in Kotlin, arguably one of the more pleasant and productive
  programming languages
- JVM based, so we've got access to its ecosystem

### Dangers

- The Flutter tool has quite strong assumptions about Gradle project structure
  and some hacking and workaround are required to make it work.

- Nobody does this, zero support
