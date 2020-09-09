DESCRIPTION = "Fairly minimal image for aufgabe1 (simple console app)"
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
"

# Add an extra 0.5 GB of free space to the root filesystem
IMAGE_ROOTFS_EXTRA_SPACE = "524288"

