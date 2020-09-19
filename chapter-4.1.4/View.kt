interface View {
    fun getCurrentState(): State
    fun restoreState(state: State) {}
}
