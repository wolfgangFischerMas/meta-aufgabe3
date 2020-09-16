DESCRIPTION = "Fairly minimal image for aufgabe4 (Same Game + cups + samba)"
LICENSE = "MIT"

inherit core-image

DEPENDS += "bcm2835-bootfiles"

IMAGE_FEATURES += "\
    splash \
    ssh-server-dropbear \
    debug-tweaks \
"

IMAGE_INSTALL += " \
    packagegroup-aufgabe3-devtools \
    packagegroup-qml-basic \
    packagegroup-qml-multimedia \
    aufgabe3 \
    cups \
    cups-doc \
    libpam \
    samba \
    smbclient \
    cifs-utils \
"

# Add an extra 0.5 GB of free space to the root filesystem
IMAGE_ROOTFS_EXTRA_SPACE = "524288"

