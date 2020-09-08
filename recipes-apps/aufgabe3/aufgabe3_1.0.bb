SUMMARY = "Aufgabe3 - SameGame"
AUTHOR = "Wolfgang Fischer (w.fischer@mas-software.de)"
HOMEPAGE = "https://github.com/wolfgangFischerMas/EinarbeitungYocto"

SECTION = "app"

LICENSE = "MIT"
LIC_FILES_CHKSUM="file://LICENSE;md5=1ef68d7e526c164e11da8965fdbed52c"

inherit qmake5 update-rc.d

SRC_URI = "\
    git://github.com/wolfgangFischerMas/EinarbeitungYocto;branch=master;protocol=https \
    file://aufgabe3 \
"
SRCREV = "507f56ddb88f9f92f0d10f9bf70cd0d7d1fa9810"

PV = "1.0+git${SRCREV}"

DEPENDS = "qtmultimedia"

INITSCRIPT_NAME = "aufgabe3"
INITSCRIPT_PARAMS = "defaults 70"

S = "${WORKDIR}/git"

do_install_append() {
  install -d ${D}${sysconfdir}/init.d/
  install -m 0755 ${WORKDIR}/aufgabe3 ${D}${sysconfdir}/init.d/aufgabe3
}


FILES_${PN} += "/usr/local/bin/${PN}"
