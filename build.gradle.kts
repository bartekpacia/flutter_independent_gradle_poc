tasks.register("optimizeAssets") {
    group = "Custom"
    description = "Generates optimized variants of /assets"

    doLast {
        logger.quiet("Generating optimized assets")
    }
}

tasks.register("updateL10n") {
    group = "Custom"
    description = "Updates localization files"

    doLast {
        logger.quiet("Updating localizations")
    }
}
