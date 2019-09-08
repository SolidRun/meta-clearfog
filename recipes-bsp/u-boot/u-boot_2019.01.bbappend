FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " \
	file://0001-ddr-marvell-a38x-allow-board-specific-clock-out-setu.patch \
	file://0002-board-clearfog-enable-both-DDR-clocks.patch \
	"
