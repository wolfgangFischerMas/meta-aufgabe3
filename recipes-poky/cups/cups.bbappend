inherit update-rc.d

INITSCRIPT_NAME = "cups"
INITSCRIPT_PARAMS = "defaults"

SRC_URI += "file://cups.initd"

do_install_append () {
   install -d -m 0755 ${D}${sysconfdir}/init.d
   install -m 0755 ${WORKDIR}/cups.initd ${D}${sysconfdir}/init.d/cups
}
