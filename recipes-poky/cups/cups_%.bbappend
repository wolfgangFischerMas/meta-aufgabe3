inherit update-rc.d

INITSCRIPT_NAME = "cups"
INITSCRIPT_PARAMS = "defaults 20"

SRC_URI_append = "file://cups.initd"

do_install_append () {
   bbnote "in do_install_append cups"
   install -d -m 0755 ${D}${sysconfdir}/init.d
   install -m 0755 ${WORKDIR}/cups.initd ${D}${sysconfdir}/init.d/cups
}

FILESEXTRAPATHS_prepend := "${THISDIR}/cups_:"
