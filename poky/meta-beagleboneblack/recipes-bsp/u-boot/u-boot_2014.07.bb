require u-boot-ti.inc

# DEPEND on dtc-native for mainline u-boot because the mainline u-boot depends
# on some of the latest syntax constructs for an appended in dtb used for
# items like secure boot/image signing.
DEPENDS += "dtc-native"

DESCRIPTION = "Mainline u-boot bootloader"

DEFAULT_PREFERENCE = "-1"

SRC_URI = "file://${COREBASE}/u-boot-2014.07-r0/git"


# Corresponds to tag v2014.07

SPL_BINARY = "MLO"
SPL_UART_BINARY = "u-boot-spl.bin"

SPL_BINARY_omapl138 = ""
SPL_UART_BINARY_omapl138 = ""
