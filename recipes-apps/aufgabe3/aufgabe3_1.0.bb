SUMMARY = "Aufgabe3 - SameGame"
AUTHOR = "Wolfgang Fischer (w.fischer@mas-software.de)"
HOMEPAGE = "https://github.com/wolfgangFischerMas/EinarbeitungYocto"

SECTION = "app"

LICENSE = "MIT"
LIC_FILES_CHKSUM="file://LICENSE;md5=1ef68d7e526c164e11da8965fdbed52c"

inherit qmake5 update-rc.d

SRC_URI = "\
    git://github.com/wolfgangFischerMas/qt-prj-samegame.git;branch=master;protocol=https \
    file://samegame \
"
SRCREV = "7f9fb2aff3c85bff68beaa7eb414063bfb3d64be"

PV = "1.0+git${SRCREV}"

DEPENDS = "qtmultimedia"

INITSCRIPT_NAME = "samegame"
INITSCRIPT_PARAMS = "defaults 70"

S = "${WORKDIR}/git"

do_install_append() {
  install -d ${D}${sysconfdir}/init.d/
  install -m 0755 ${WORKDIR}/samegame ${D}${sysconfdir}/init.d/samegame
}


FILES_${PN} += "/usr/local/bin/samegame"
