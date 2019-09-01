FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
COMPATIBLE_MACHINE_clearfog = "^clearfog$"

KERNEL_IMAGETYPE = "zImage"
KCONFIG_MODE = "--alldefconfig"

KERNEL_DEVICETREE_clearfog = " \
	armada-388-clearfog-base.dtb \
	armada-388-clearfog-pro.dtb \
	armada-388-clearfog.dtb \
	"

SRC_URI += "file://clearfog.cfg"
