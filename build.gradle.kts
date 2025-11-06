import org.zaproxy.gradle.addon.AddOnStatus
import org.zaproxy.gradle.addon.misc.ConvertMarkdownToHtml

plugins {
    `java-library`
    id("org.zaproxy.add-on") version "0.13.1"
    id("com.diffplug.spotless")
    id("org.zaproxy.common")
}

description = "FuzzAI files which can be used with the ZAP fuzzer!!!"

zapAddOn {
    addOnId.set("fuzzai")
    addOnName.set("FuzzAI Files")
    zapVersion.set("2.16.0")
    addOnStatus.set(AddOnStatus.ALPHA)

    releaseLink.set("https://github.com/youruser/javaexample/compare/v@PREVIOUS_VERSION@...v@CURRENT_VERSION@")
    unreleasedLink.set("https://github.com/youruser/javaexample/compare/v@CURRENT_VERSION@...HEAD")

    manifest {
        author.set("Marios Gyftos & Yiannis Pavlosoglou")
        url.set("https://www.zaproxy.org/docs/desktop/addons/fuzzai-files/")
        repo.set("https://github.com/CyberRiskEngineering/zap-fuzzai-addon")
        changesFile.set(tasks.named<ConvertMarkdownToHtml>("generateManifestChanges").flatMap { it.html })

        helpSet {
            baseName.set("help%LC%.helpset")
            localeToken.set("%LC%")
        }
    }
}

java {
    val javaVersion = JavaVersion.VERSION_17
    sourceCompatibility = javaVersion
    targetCompatibility = javaVersion
}

spotless {
    kotlinGradle {
        ktlint()
    }
}
