package net.fabricmc.mappings;

import java.util.Collection;
import java.util.Collections;

import net.fabricmc.mappings.model.Comments;
import net.fabricmc.mappings.model.LocalVariableEntry;
import net.fabricmc.mappings.model.MethodParameterEntry;

final class ExtendedWrapper implements ExtendedMappings {
	private final Mappings mappings;

	public ExtendedWrapper(Mappings mappings) {
		this.mappings = mappings;
	}

	@Override
	public Collection<String> getNamespaces() {
		return mappings.getNamespaces();
	}

	@Override
	public Collection<? extends ClassEntry> getClassEntries() {
		return mappings.getClassEntries();
	}

	@Override
	public Collection<? extends FieldEntry> getFieldEntries() {
		return mappings.getFieldEntries();
	}

	@Override
	public Collection<? extends MethodEntry> getMethodEntries() {
		return mappings.getMethodEntries();
	}

	@Override
	public boolean isExtended() {
		return false;
	}

	@Override
	public Collection<? extends MethodParameterEntry> getMethodParameterEntries() {
		return Collections.emptyList();
	}

	@Override
	public Collection<? extends LocalVariableEntry> getLocalVariableEntries() {
		return Collections.emptyList();
	}

	@Override
	public Comments getComments() {
		return Comments.empty();
	}
}