import systems.danger.kotlin.*

danger(args) {
    onGitHub {
        message("You have added 2 more modules to the app")
        warn("You have not included a CHANGELOG entry.")
        fail("Lint has failed")
        markdown("## New module Danger")
    }
}
